package dev.ibraheem.SPMSServices;
import java.util.List;

import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.SPMSdata.PitchTableDAO;
import dev.ibraheem.project1.*;


public interface EditorServices {

	//public List<PitchTable> showAllPitches();
	public  Object ShowPitchTable();

	PitchTable ShowPitchTable(PitchTable Edr);

	List<PitchTable> showAllPitches();

	List<PitchTable> showPitches();
}

