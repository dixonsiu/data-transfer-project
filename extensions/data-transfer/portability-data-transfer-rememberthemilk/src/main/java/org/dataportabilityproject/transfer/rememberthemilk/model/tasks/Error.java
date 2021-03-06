/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataportabilityproject.transfer.rememberthemilk.model.tasks;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;
import com.google.common.base.MoreObjects;

/** Error details from RTM */
public class Error {

  @JacksonXmlProperty(isAttribute = true, localName = "code")
  public int code;

  @JacksonXmlProperty(isAttribute = true, localName = "msg")
  public String msg;

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("code", code).add("msg", msg).toString();
  }
}
