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
package org.mitre.uma.client.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mitre.uma.config.ServerConfiguration;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;

import org.mitre.uma.rs.service.impl.DynamicUmaServerConfigurationService;

/**
 * @author tsitkov
 *
 */
//@RunWith(MockitoJUnitRunner.class)
public class TestStaticUmaServerConfigurationService {

	private DynamicUmaServerConfigurationService service;
	private String issuer = "http://localhost:8080/openid-connect-server-webapp/";

	@Test
	public void t1() throws Exception {

		service = new DynamicUmaServerConfigurationService();

                ServerConfiguration conf = service.getServerConfiguration(issuer);
              //  ServerConfiguration conf = service.load(issuer);
//assertEquals("ZZZZ", conf.getIssuer());

//assertEquals("YYY-ZZZZ","CCCC");
              //  service.getServerConfiguration(issuer);
        }

/*
	private StaticServerConfigurationService service;

	//private String issuer = "https://www.example.com/";
	private String issuer = "http://localhost:8080";

//	@Mock
	private ServerConfiguration mockServerConfig;

	@Before
	public void prepare() {

		service = new StaticServerConfigurationService();

		Map<String, ServerConfiguration> servers = new HashMap<String, ServerConfiguration>();
		servers.put(issuer, mockServerConfig);

		service.setServers(servers);
	}

	@Test
	public void getServerConfiguration_success() {

		ServerConfiguration result = service.getServerConfiguration(issuer);
assertEquals(issuer , result);

		assertThat(mockServerConfig, is(notNullValue()));
		assertEquals(mockServerConfig, result);
	}
*/
	/**
	 * Checks the behavior when the issuer is not known.
	 */
/*	@Test
	public void getClientConfiguration_noIssuer() {

		ServerConfiguration result = service.getServerConfiguration("www.badexample.net");

		assertThat(result, is(nullValue()));
	}
*/
}
