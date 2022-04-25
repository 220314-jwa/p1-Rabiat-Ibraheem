package dev.ibraheem.SPMSmain;

import dev.ibraheem.SPMSdata.UserInfoDAO;
import dev.ibraheem.project1.UserInfo;
import io.javalin.http.Context;

public class UserController {
	

	public static void checkUserInfo(Context ctx) {
		System.out.println("Finding user");
		UserInfo u = ctx.sessionAttribute("user");
		//System.out.println(p);
		if (u != null) {
			System.out.println(" User details for " + u.getFirst_name());
			ctx.json(u);
			ctx.status(200);
		} else {
			System.out.println("user not found");
			ctx.status(400);
		}
	}
	/* public static void logIn(Context ctx) {
		System.out.println("Logging in");
		String username = ctx.queryParam("user");
	//	String password = ctx.queryParam("pass");
		
		UserInfo u = UserInfoDAO.findByUsername(username);
		//System.out.println(p);
		if (u != null) {
			// needs to set up password as well
			{
				System.out.println("Logged in as " + u.getFirst_name());
				ctx.status(200);
				ctx.json(u);
				ctx.sessionAttribute("user", u);
				//System.out.println(p);
			}
		}
		else
		{
			ctx.status(404);
		}
	} */
}
