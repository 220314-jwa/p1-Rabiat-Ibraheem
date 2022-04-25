package dev.ibraheem.SPMSmain;
import dev.ibraheem.project1.UserInfo;
import dev.ibraheem.project1.Genre;
import dev.ibraheem.SPMSExceptions.UsernameAlreadyExistsException;
import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.SPMSServices.UserServices;
import dev.ibraheem.SPMSServices.UserServicesImp;
import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import io.javalin.Javalin;
import io.javalin.http.HttpCode;


public class StoryProjectMain {
	private static UserServices userServ = new UserServicesImp();


	//private static final String user_info = null;

	public static void main(String[] args) {
		Javalin app;
		app = Javalin.create();
		app.start(8081);		// start up the javalin server for http requests
		
	app.get("/hello",ctx -> ctx.result("Hello World"));		
	
	
   // app.post("/hello") { ctx -> ctx.result("Hello World"));
		
    	//}	
    
	app.post("/users", ctx -> {
		UserInfo newUserInfo = ctx.bodyAsClass(UserInfo.class);
		
		try {
			newUserInfo = userServ.register(newUserInfo);
			ctx.json(newUserInfo);
		} catch (UsernameAlreadyExistsException e) {
			ctx.status(HttpCode.CONFLICT); // 409 conflict
		}
	});

	}
}


