/*
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.hadoop.admin.cli.hdfs.plugin;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.roo.shell.CliCommand;
import org.springframework.roo.shell.CommandMarker;
import org.springframework.roo.support.util.StringUtils;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.stereotype.Component;

/**
 * Banner Provider to customize Spring Shell Banner
 * 
 * @author Jarred Li
 *
 */
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class HDFSPluginBannerProvider extends DefaultBannerProvider 
				implements CommandMarker {

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.BannerProvider#getBanner()
	 */
	@CliCommand(value = { "version" }, help = "Displays current CLI version")
	public String getBanner() {
		StringBuffer buf = new StringBuffer();
		buf.append("=======================================" + StringUtils.LINE_SEPARATOR);
		buf.append("*                                      *"+ StringUtils.LINE_SEPARATOR);
		buf.append("*                                      *"+ StringUtils.LINE_SEPARATOR);
		buf.append("*      CLI Plugin for HDFS             *" +StringUtils.LINE_SEPARATOR);
		buf.append("*                                      *"+ StringUtils.LINE_SEPARATOR);
		buf.append("*                                      *"+ StringUtils.LINE_SEPARATOR);
		buf.append("=======================================" + StringUtils.LINE_SEPARATOR);
		buf.append("Verson:" + this.getVersion());
		return buf.toString();

	}

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.BannerProvider#getVersion()
	 */
	public String getVersion() {
		return "1.0.0";
	}

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.BannerProvider#getWelcomeMessage()
	 */
	public String getWelcomeMessage() {
		return "Welcome to HDFS CLI";
	}
	
	@Override
	public String name() {
		return "hdfs cli banner provider";
	}
	

}
