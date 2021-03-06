/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.gwt.shared;

import java.util.ArrayList;
import java.util.HashMap;

import org.unitime.timetable.gwt.command.client.GwtRpcRequest;
import org.unitime.timetable.gwt.command.client.GwtRpcResponse;
import org.unitime.timetable.gwt.command.client.GwtRpcResponseNull;

/**
 * @author Tomas Muller
 */
public class UserDataInterface extends HashMap<String, String> implements GwtRpcResponse {
	private static final long serialVersionUID = 1L;

	public static class GetUserDataRpcRequest extends ArrayList<String> implements GwtRpcRequest<UserDataInterface> {
		private static final long serialVersionUID = 1L;
	}
	
	public static class SetUserDataRpcRequest extends UserDataInterface implements GwtRpcRequest<GwtRpcResponseNull> {
		private static final long serialVersionUID = 1L;
	}
}
