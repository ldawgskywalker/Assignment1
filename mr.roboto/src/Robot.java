public class Robot {
	private String name, d;
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
	// GET and SET METHODS
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

	public void setPts(int pts){
		
	}
	
	public void stringDir(){
		if(dir==1)
			d = "UP";
		if(dir==2)
			d = "DOWN";
		if(dir==3)
			d = "DIAG";
	}
	
	// END OF GET SETS //
	
	
	
	public void move(){
		
		int m = (int)Math.random()*3+1;
		
		//UP
		if(dir==1){
			while(m+ypos>8){
				m = (int)Math.random()*3+1;
			}
			ypos+=m;
		}
		//DIAGNAL
		if(dir==3){
			while(m+ypos>8 && m+xpos>8){
				 m = (int)Math.random()*3+1;
			}
			xpos+=m;
			ypos+=m;
		}
		//RIGHT
		if(dir==2){
			while(m+xpos>8){
				m = (int)Math.random()*3+1;			
			}
			xpos+=m;
		}
	}
	public String toString(){
		return "Name: "+name+ "("+xpos+", "+ypos+")"+
				"\nX Position: "+xpos+"\tY Position: "+ypos+
				"\nPoints Collected: "+pts;
	}
	
	public String amIAhead(Robot r){
		if(xpos+ypos>r.getXpos()+r.getYpos()){
			return name+" is ahead!";
		}
		if(xpos+ypos<r.getXpos()+r.getYpos()){
			return r.getName()+" is ahead!";
		}
		return "They are the same distance from the goal!";
	}
	
	
}
