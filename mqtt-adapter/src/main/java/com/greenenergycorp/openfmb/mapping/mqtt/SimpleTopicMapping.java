/**
 * Copyright 2016 Green Energy Corp.
 *
 * Licensed to Green Energy Corp (www.greenenergycorp.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Green Energy
 * Corp licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.greenenergycorp.openfmb.mapping.mqtt;

/**
 * Implements topic mapping that uses the message type as the base topic and appends the message id.
 */
public class SimpleTopicMapping implements MqttTopicMapping {

    /**
     * Topic mapping that uses the message type as the base topic and appends the message id.
     *
     * @param messageType OpenFMB message type
     * @param messageId Logical device ID of message instance
     * @return MQTT topic
     */
    public String toTopic(String messageType, String messageId) {
        return messageType + "/" + messageId;
    }
}