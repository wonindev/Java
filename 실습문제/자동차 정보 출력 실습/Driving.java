
interface Driving {
	String TWO_WHEEL_DRIVE =  "이륜구동";
	String FOUR_WHEEL_DRIVE =  "사륜구동";

}

interface PowerSource { // 자동차의 연료 표현. 가솔린, 디젤, 전기 등
	String fueltype();
}

interface MovingPower { // 자동차 구동력을 표현. 엔진 또는 전기모터 등.
	String drivingpower();
}

interface Feature { // 자동차의 활용에 대한 정보 표현. 승용, 운반용, 적재용량, 짐칸 크기 등
	
}
