/*
 *
 *  *  Copyright 2010-2016 OrientDB LTD (http://orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://orientdb.com
 *
 */
package com.orientechnologies.orient.server.distributed.impl.task;

import com.orientechnologies.orient.core.serialization.OStreamable;
import com.orientechnologies.orient.core.serialization.OStreamableHelper;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of distributed transaction.
 *
 * @author Luca Garulli (l.garulli--(at)--orientdb.com)
 */
public class OTransactionPhase1TaskResult implements OStreamable {

  public OTransactionPhase1TaskResult() {
  }

  @Override
  public void toStream(final DataOutput out) throws IOException {
  }

  @Override
  public void fromStream(final DataInput in) throws IOException {
  }

}