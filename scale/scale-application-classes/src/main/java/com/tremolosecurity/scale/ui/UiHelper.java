/*
Copyright 2015 Tremolo Security, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.tremolosecurity.scale.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="uiHelper")
@RequestScoped
public class UiHelper {

	public String generateActiveHighlight(String name) {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		if (name.equalsIgnoreCase("home") && request.getRequestURI().endsWith("/index.xhtml")) {
			return "active";
		} else if (name.equalsIgnoreCase("user") && request.getRequestURI().endsWith("/user.xhtml")) {
			return "active";
		} else if (name.equalsIgnoreCase("requestaccess") && request.getRequestURI().endsWith("/requestaccess.xhtml")) {
			return "active";
		} else if (name.equalsIgnoreCase("cart") && request.getRequestURI().endsWith("/cart.xhtml")) {
			return "active";
		} else if (name.equalsIgnoreCase("approvals") && request.getRequestURI().endsWith("approvals.xhtml")) {
			return "active";
		} else if (name.equalsIgnoreCase("logout") && request.getRequestURI().endsWith("logout.xhtml")) {
			return "active";
		} else {
			return "";
		}
		
	}
	

}
