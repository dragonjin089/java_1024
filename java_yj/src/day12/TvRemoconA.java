package day12;

public class TvRemoconA implements TvRemoteController {

	
	private int channel;
	private int volumn;
	private boolean power;
	
	
	public void turn() {
		// power 가 켜져있으면 꺼야하고 ,꺼져있으면 켜야함
		power = !power;

	}

	@Override
	public void channel(int channel) {
		if(!power) {
			return;
		}
		// TODO Auto-generated method stub
		this.channel = channel;
		System.out.println("채널 : " + channel);
	}

	@Override
	public void channelUp() {
		if(!power) {
			return;
		}
		// TODO Auto-generated method stub
		channel++;
		System.out.println("채널 : " + channel);
	}

	@Override
	public void channelDown() {
		if(!power) {
			return;
		}
		// TODO Auto-generated method stub
		channel--;
		channel = channel < 1 ? 999 : channel;
		System.out.println("채널 : " + channel);
	}

	@Override
	public void volumnUp() {
		if(!power) {
			return;
		}
		// TODO Auto-generated method stub
		volumn++;
		volumn = volumn > 30 ? 30 : volumn;
		System.out.println("볼륨 : " + volumn);

	}
	
	@Override
	public void volumnDown() {
		if(!power) {
			return;
		}
		// TODO Auto-generated method stub
		volumn--;
		volumn = volumn <0 ? 0 : volumn;
		System.out.println("볼륨 : " + volumn);

	}

	public void print() {
		System.out.println("전원 ㅣ "  + (power ? "ON" : "OFF"));
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volumn);
	}
}
