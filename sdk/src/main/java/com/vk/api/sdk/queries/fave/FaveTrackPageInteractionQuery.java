package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.trackPageInteraction method
 */
public class FaveTrackPageInteractionQuery extends AbstractQueryBuilder<FaveTrackPageInteractionQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveTrackPageInteractionQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.trackPageInteraction", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveTrackPageInteractionQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveTrackPageInteractionQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected FaveTrackPageInteractionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}