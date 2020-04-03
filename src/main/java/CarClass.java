public class CarClass {
 private int model;
	private String make;
	private int spd;
	
	public CarClass(int year, String mk){
		model = year;
		make = mk;
		spd = 0;
	}
	
	public static void main(String[] args) {
		CarClass rona = new CarClass(2020, "Corolla");
		rona.acc();
		System.out.println(rona.speed()+" mph");
		rona.acc();
		System.out.println(rona.speed()+" mph");
		rona.acc();
		System.out.println(rona.speed()+" mph");
		rona.acc();
		System.out.println(rona.speed()+" mph");
		rona.acc();
		System.out.println(rona.speed()+" mph");
		rona.brk();
		System.out.println(rona.speed()+" mph");
		rona.brk();
		System.out.println(rona.speed()+" mph");
		rona.brk();
		System.out.println(rona.speed()+" mph");
		rona.brk();
		System.out.println(rona.speed()+" mph");
		rona.brk();
		System.out.println(rona.speed()+" mph");
		
	}

	public int getmodel() {
		return model;
	}

	public void setmodel(int model) {
		this.model = model;
	}

	public String make() {
		return make;
	}

	public void setmake(String make) {
		this.make = make;
	}

	public int speed() {
		return spd;
	}

	public void setspeed(int sspeed) {
		this.spd = sspeed;
	}
	
	public void acc(){
		spd += 5;
		
	}
	
	public void brk(){
		spd -= 5;
		if (spd < 0) spd = 0;
        }
}

