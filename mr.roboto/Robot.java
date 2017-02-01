public class Robot {
	private String name;
	private int xpos, ypos;
	private int dir;
	private int pts;
	
	public Robot(String n, int d){
		name = n;
		dir  = d;
		xpos = 1;
		ypos = 1;
		pts  = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getPts() {
		return pts;
	}

	public void setPts(int pts) {
		this.pts = pts;
	}
	
	public void move(int m){
		//UP
		if(dir==1)
			ypos+=m;
		//DIAGNAL
		if(dir==2){
			xpos+=m;
			ypos+=m;
		}
		//RIGHT
		if(dir==3)
			xpos+=m;
	}
	
	
}
