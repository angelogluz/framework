/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.shared.ui.treegrid;

import com.vaadin.shared.communication.ClientRpc;

/**
 * Server-to-client RPC interface for the TreeGrid component.
 *
 * @since 8.1
 * @author Vaadin Ltd
 */
public interface TreeGridClientRpc extends ClientRpc {

    /**
     * Inform the client that an item with the given key has been expanded by
     * the server.
     *
     * @param key
     *            the communication key of the expanded item
     */
    public void setExpanded(String key);

    /**
     * Inform the client that an item with the given key has been collapsed by
     * the server.
     *
     * @param key
     *            the communication key of the collapsed item
     */
    public void setCollapsed(String key);
}
