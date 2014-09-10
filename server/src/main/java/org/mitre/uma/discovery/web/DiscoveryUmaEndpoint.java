/*******************************************************************************
 * Copyright 2014 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.mitre.uma.discovery.web;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mitre.openid.connect.config.ConfigurationPropertiesBean;
import org.springframework.ui.Model;

import org.mitre.openid.connect.model.UserInfo;
import org.mitre.openid.connect.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JWSAlgorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;


/**
 * 
 * Handle UMA Discovery.
 * 
 * @author tsitkov
 *
 */

@Controller
public class DiscoveryUmaEndpoint {


        private static Logger logger = LoggerFactory.getLogger(DiscoveryUmaEndpoint.class);

        @Autowired
        private ConfigurationPropertiesBean config;

        @RequestMapping("/.well-known/uma-configuration")
        public String providerConfiguration(Model model) {

                String baseUrl = config.getIssuer();
                /* Per section 1.4 of UMA core required params */

                Map<String, Object> m = new HashMap<String, Object>();
/*
                m.put("issuer",  "http://localhost:8080/uma-server/");
                m.put("version", "1.0"); 
	        m.put("pat_profiles_supported", "bearer");
	        m.put("aat_profiles_supported", "bearer");
	        m.put("rpt_profiles_supported", "bearer");
	        m.put("pat_grant_types_supported", "authorization_code");
	        m.put("aat_grant_types_supported", "authorization_code");
	        m.put("token_endpoint", "http://localhost:8080/uma-server/token_uri/");
	        m.put("user_endpoint", "http://localhost:8080/uma-server/user_uri/");
	        m.put("introspection_endpoint", "http://localhost:8080/uma-server/status_uri/");
	        m.put("resource_set_registration_endpoint", "http://localhost:8080/uma-server/rsrc_uri");
	        m.put("rpt_endpoint", "http://localhost:8080/uma-server/rpt_uri");
	        m.put("authorization_request_endpoint", "http://localhost:8080/uma-server/perm_uri");
*/
                m.put("issuer",  "http://localhost:8080/openid-connect-server-webapp/");
                m.put("version", "1.0"); 
	        m.put("pat_profiles_supported", "bearer");
	        m.put("aat_profiles_supported", "bearer");
	        m.put("rpt_profiles_supported", "bearer");
	        m.put("pat_grant_types_supported", "authorization_code");
	        m.put("aat_grant_types_supported", "authorization_code");
	        m.put("token_endpoint", "http://localhost:8080/openid-connect-server-webapp/token_uri/");
	        m.put("user_endpoint", "http://localhost:8080/openid-connect-server-webapp/user_uri/");
	        m.put("introspection_endpoint", "http://localhost:8080/openid-connect-server-webapp/status_uri/");
	        m.put("resource_set_registration_endpoint", "http://localhost:8080/openid-connect-server-webapp/rsrc_uri");
	        m.put("rpt_endpoint", "http://localhost:8080/openid-connect-server-webapp/rpt_uri");
	        m.put("authorization_request_endpoint", "http://localhost:8080/openid-connect-server-webapp/perm_uri");

                model.addAttribute("entity", m);

                return "jsonEntityView";

        }
}
