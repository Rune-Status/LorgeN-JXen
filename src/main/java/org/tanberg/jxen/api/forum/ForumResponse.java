package org.tanberg.jxen.api.forum;

import org.tanberg.jxen.entity.forum.Forum;
import org.tanberg.jxen.entity.forum.Page;
import org.tanberg.jxen.entity.forum.thread.Thread;

import javax.annotation.concurrent.Immutable;

@Immutable
final class ForumResponse {

    private final Forum forum;
    private final Page page;

    private final Thread[] threads;
    private final Thread[] stickThreads;

    ForumResponse(Forum forum, Page page, Thread[] threads, Thread[] stickyThreads) {
        this.forum = forum;
        this.page = page;

        this.threads = threads;
        this.stickThreads = stickyThreads;
    }

    public Forum getForum() {
        return this.forum;
    }

    public Page getPage() {
        return this.page;
    }

    public Thread[] getThreads() {
        return this.threads;
    }

    public Thread[] getStickyThreads() {
        return this.stickThreads;
    }
}
