package prob4;

public class MusicPhone extends Phone {
	
	public void execute ( String function ) {
		//이 구현 좀 신기해요!!!**********************************
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}
		super.execute( function );
	}

	private void playMusic(){
		System.out.println("MP3 플레이어에서 음악재생");
	}
}
