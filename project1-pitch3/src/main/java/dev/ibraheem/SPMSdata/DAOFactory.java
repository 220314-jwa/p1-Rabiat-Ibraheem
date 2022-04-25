package dev.ibraheem.SPMSdata;


public class DAOFactory {
	//DAO Factory
	private static EditorDAO editorDAO = null;
	private static GenreDAO genreDAO = null;
	private static PitchTableDAO pitchTableDAO = null;
	private static UserInfoDAO userInfoDAO = null;
	
	private DAOFactory()	{}
		public static UserInfoDAO getUserInfoDAO(){
			if (userInfoDAO==null) {
				userInfoDAO = new UserPostgres();
			}
			return userInfoDAO;
		}
		 public static PitchTableDAO getPitchTableDAO() {
		        // If & else prevents us from creating a new one if one already exists
		        if (pitchTableDAO == null) {
		        	pitchTableDAO = new PitchTablePostgres();
		        }
		        return pitchTableDAO;
		    }
	}
	

