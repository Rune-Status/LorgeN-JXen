package org.tanberg.jxen;

import org.tanberg.jxen.api.AttachmentsApi;
import org.tanberg.jxen.api.AuthApi;
import org.tanberg.jxen.api.ConversationMessagesApi;
import org.tanberg.jxen.api.ConversationsApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;

public class JXen {

    private static final AtomicReference<JXen> INSTANCE = new AtomicReference<>(null);
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final Retrofit.Builder BUILDER = new Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create());

    private final String apiKey;
    private final String baseUrl;
    private final Retrofit retrofit;

    private JXen(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.retrofit = BUILDER.baseUrl(JXen.get().getBaseUrl()).build();
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public AttachmentsApi getAttachmentsApi() {
        return this.retrofit.create(AttachmentsApi.class);
    }

    public AuthApi getAuthApi() {
        return this.retrofit.create(AuthApi.class);
    }

    public ConversationMessagesApi getConversationMessagesApi() {
        return this.retrofit.create(ConversationMessagesApi.class);
    }

    public ConversationsApi getConversationsApi() {
        return this.retrofit.create(ConversationsApi.class);
    }

    public static class Builder {

        private volatile String apiKey = "";
        private volatile String baseUrl = "";

        public Builder setApiKey(Path apiKey, Charset charset) throws IOException {
            StringBuilder builder = new StringBuilder();
            Files.readAllLines(Paths.get(apiKey.toUri()), charset == null ? JXen.DEFAULT_CHARSET : charset).forEach(builder::append);

            this.apiKey = builder.toString();

            return this;
        }

        public Builder setApiKey(File file, Charset charset) throws IOException {
            return this.setApiKey(file.toPath(), charset);
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;

            return this;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;

            return this;
        }

        public JXen build() {
            if (this.apiKey.equals("") || this.baseUrl.equals("")) {
                throw new RuntimeException("Required API instantiation fields are not present.");
            }

            JXen jx = new JXen(this.apiKey, this.baseUrl);
            INSTANCE.set(jx);

            return jx;
        }
    }

    public static JXen get() {
        JXen jx = INSTANCE.get();

        if (jx == null) {
            throw new IllegalStateException("JXen has not been instantiated.");
        }

        return jx;
    }
}
