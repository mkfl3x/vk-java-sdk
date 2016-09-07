package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.ChatFull;
import com.vk.api.sdk.queries.Field;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getChat method
 */
public class MessagesGetChatQueryWithChatIdsFields extends AbstractQueryBuilder<MessagesGetChatQueryWithChatIdsFields, List<ChatFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetChatQueryWithChatIdsFields(VkApiClient client, Actor actor, Integer[] chatIds, Field... fields) {
        super(client, "messages.getChat", Utils.buildParametrizedType(List.class, ChatFull.class));
        accessToken(actor.getAccessToken());
        chatIds(chatIds);
        fields(fields);
    }

    /**
     * Chat IDs.
     *
     * @param value value of "chat ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatQueryWithChatIdsFields chatIds(Integer... value) {
        return unsafeParam("chat_ids", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatQueryWithChatIdsFields fields(Field... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatQueryWithChatIdsFields nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected MessagesGetChatQueryWithChatIdsFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}