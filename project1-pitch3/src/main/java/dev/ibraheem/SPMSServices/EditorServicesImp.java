package dev.ibraheem.SPMSServices;

import java.util.List;

import dev.ibraheem.SPMSdata.PitchTablePostgres;
import dev.ibraheem.project1.PitchTable;

public class EditorServicesImp implements EditorServices{

	@Override
	public Object ShowPitchTable() {
		Object ptlist = PitchTablePostgres.select_all;
		return ptlist;
		
	}

	@Override
	public PitchTable ShowPitchTable(PitchTable Edr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PitchTable> showAllPitches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PitchTable> showPitches() {
		// TODO Auto-generated method stub
		return null;
	}
 
}

