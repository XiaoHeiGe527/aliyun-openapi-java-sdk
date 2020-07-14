/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RollbackGtmRecoveryPlanRequest extends RpcAcsRequest<RollbackGtmRecoveryPlanResponse> {
	   

	private Long recoveryPlanId;

	private String lang;
	public RollbackGtmRecoveryPlanRequest() {
		super("Alidns", "2015-01-09", "RollbackGtmRecoveryPlan", "Alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRecoveryPlanId() {
		return this.recoveryPlanId;
	}

	public void setRecoveryPlanId(Long recoveryPlanId) {
		this.recoveryPlanId = recoveryPlanId;
		if(recoveryPlanId != null){
			putQueryParameter("RecoveryPlanId", recoveryPlanId.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<RollbackGtmRecoveryPlanResponse> getResponseClass() {
		return RollbackGtmRecoveryPlanResponse.class;
	}

}
