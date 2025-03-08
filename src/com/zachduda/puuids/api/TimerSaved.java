package com.zachduda.puuids.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.concurrent.CompletableFuture;

public class TimerSaved extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    // Event that is fired when a task is actually saved to file. You can get your Task ID from set and track it here!
    private final String plname;
    private final String uuid;
    private final int taskid;
    private final CompletableFuture<Integer> future;

    public TimerSaved(String plname, String uuid, int taskid, CompletableFuture<Integer> future) {
        super(true);
        this.plname = plname;
        this.taskid = taskid;
        this.uuid = uuid;
        this.future = future;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public String getPlugin() {
        return this.plname;
    }

    public int getId() {
        return this.taskid;
    }

    public String getUUID() {
        return this.uuid;
    }

    public CompletableFuture<Integer> getFuture() {
        return this.future;
    }
}
