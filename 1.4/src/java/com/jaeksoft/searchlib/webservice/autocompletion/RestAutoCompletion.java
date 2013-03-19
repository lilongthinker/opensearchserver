/**   
 * License Agreement for OpenSearchServer
 *
 * Copyright (C) 2011-2013 Emmanuel Keller / Jaeksoft
 * 
 * http://www.open-search-server.com
 * 
 * This file is part of OpenSearchServer.
 *
 * OpenSearchServer is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 * OpenSearchServer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with OpenSearchServer. 
 *  If not, see <http://www.gnu.org/licenses/>.
 **/

package com.jaeksoft.searchlib.webservice.autocompletion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jaeksoft.searchlib.webservice.CommonResult;

@Path("/autocompletion")
public interface RestAutoCompletion {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/set/{index}/xml")
	public CommonResult setXML(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key,
			@QueryParam("field") String field, @QueryParam("rows") Integer rows);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/set/{index}/json")
	public CommonResult setJSON(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key,
			@QueryParam("field") String field, @QueryParam("rows") Integer rows);

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/build/{index}/xml")
	public CommonResult buildXML(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/build/{index}/json")
	public CommonResult buildJSON(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key);

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/query/{index}/xml")
	public AutoCompletionResult queryXML(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key,
			@QueryParam("prefix") String prefix,
			@QueryParam("rows") Integer rows);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/query/{index}/json")
	public AutoCompletionResult queryJSON(@PathParam("index") String index,
			@QueryParam("login") String login, @QueryParam("key") String key,
			@QueryParam("prefix") String prefix,
			@QueryParam("rows") Integer rows);
}
