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
package com.greenenergycorp.openfmb.mapping.adapter;

import com.greenenergycorp.openfmb.mapping.model.MeasValue;
import com.greenenergycorp.openfmb.mapping.model.ReadingId;

import java.util.Map;

/**
 * Adapter used to translate updates to OpenFMB readings and struct fields to message updates.
 */
public interface DeviceAdapter {

    /**
     * Update OpenFMB readings and key fields.
     *
     * @param readingValues Map of reading IDs to value updates.
     * @param keyValues Map of key IDs to value updates.
     */
    void update(Map<ReadingId, MeasValue> readingValues, Map<String, MeasValue> keyValues);
}
