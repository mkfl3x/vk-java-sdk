package com.vk.api.sdk.events.longpoll;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;

public class GroupLongPollApi extends LongPollApi {

    private final GroupActor actor;

    public GroupLongPollApi(VkApiClient client, GroupActor actor, int waitTime) {
        super(client, waitTime);
        this.actor = actor;
    }

    public void run() {
        super.run(actor);
    }
}
