# 객체지향 프로그래밍(Object-Oriented Programming)이란?

객체 지향 프로그래밍은 컴퓨터 프로그래밍 패러다임 중 하나로, 프로그래밍에서 필요한 데이터를 추상화시켜 상태와 행위를 가진 객체를 만들고 그 객체들 간의 유기적인 상호작용을 통해 로직을 구성하는 프로그래밍 방법이다.

즉 객체지향 프로그래밍이란, 조립식 프로그래밍이다. 객체를 조립하여 전체 프로그램을 만드는 것이다.

![image](https://user-images.githubusercontent.com/100292629/188629397-80ec354b-d4b8-4f1a-b483-b958c043ea01.png)

---

# 객체지향 프로그램의 장점
- 코드 재사용이 용이
   - 남이 만든 클래스를 가져와서 이용할 수 있고 상속을 통해 확장해서 사용할 수 있다.
- 유지보수가 쉽다
  - 절차 지향 프로그래밍에서는 코드를 수정해야할 때 일일이 찾아 수정해야하는 반면 객체 지향 프로그래밍에서는 수정해야 할 부분이 클래스 내부에 멤버 변수혹은 메서드로 존재하기 때문에 해당 부분만 수정하면 된다.
- 대형 프로젝트에 적합
  - 클래스 단위로 모듈화시켜서 개발할 수 있으므로 대형 프로젝트처럼 여러 명, 여러 회사에서 프로젝트를 개발할 때 업무 분담하기 쉽다.
- 프로그램 확장
  - 유지보수가 쉽듯이 클래스 단위로 나눠져 있어 필요한 부분만 프로그램을 확장하기 쉬워진다.

# 객체지향 프로그램의 단점
- 처리 속도가 상대적으로 느리다.
- 객체가 많으면 용량이 커질 수 있다.
- 설계시 많은 시간과 노력이 필요하다.

---

# 객체지향 프로그래밍의 특징
- 추상화(abstraction)
  - 객체들의 공통적인 특징(기능, 속성)을 도출하는 것
    객체지향적 관점에서는 클래스를 정의하는 것을 추상화라고 할 수 있다. 클래스가 없는 객체지향 언어로 JS가 있다.
    
- 캡슐화(encapsulation)
  - 실제로 구현되는 부분을 외부에 드러나지 않도록 하여 정보를 은닉할 수 있다. 이에 접근 하는 방식으로는 Getter, Setter라는 메소드를 사용하여 접근할 수 있는데 Getter를 이용하여 private 필드를 우회적으로 가져올 수 있고, Setter를 이용하여 private 필드를 우회적으로 변경할 수 있다.

  - 객체가 독립적으로 역할을 할 수 있도록 데이터와 기능을 하나로 묶어 관리하는 것
  - 데이터를 보이지 않고 외부와 상호작용을 할 때는 메소드를     이용하여 통신을 한다. 보통 라이브러리로 만들어서 업그레이드해 사용할 수 있다. 
- 상속성(inheritance)
  - 하나의 클래스가 가진 특징(함수, 데이터)을 다른 클래스가 그대로 물려받는 것

  - 이미 작성된 클래스를 받아서 새로운 클래스를 생성하는 것
  - 기존 코드를 재활용해서 사용함으로써 객체지향 방법의 중요한 기능 중 하나에 속한다.

- 다형성(polymorphism)
  - 약간 다른 방법으로 동작하는 함수를 동일한 이름으로 호출하는 것

  - 동일한 명령의 해석을 연결된 객체에 의존하는 것
  - 오버라이딩(Overriding) - 부모클래스의 메소드와 같은 이름을 사용하며 매개변수도 같고 내부 소스를 재정의하는 것
  - 오버로딩(Overloading) - 같은 이름의 함수를 여러 개 정의한 후 매개변수를 다르게 하여 같은 이름을 경우에 따라 호출하여 사용하는 것

- 동적바인딩(Dynamic Binding)
  - 가상 함수를 호출하는 코드를 컴파일할 때, 바인딩을 실행시간에 결정하는 것.


  - 파생 클래스의 객체에 대해, 기본 클래스의 포인터로 가상 함수가 호출될 때 일어난다.
  - 함수를 호출하면 동적 바인딩을 통해 파생 클래스에 오버라이딩 된 함수가 실행
  - 프로그래밍의 유연성을 높여주며 파생 클래스에서 재정의한 함수의 호출을 보장(다형 개념 실현)





# 클래스란?
- 자바 프로그램의 프로그램 단위로 어떤 문제를 해결하기 위해 데이터를 만들고 추상화를 거쳐 집단에 속하는 속성(attribute)과 행위(behavior)를 변수와 메서드로 정의한 것으로 객체를 만들기 위한 메타정보라고 볼 수 있다.

---

# 객체란?
- 클래스에서 정의한 것을 토대로 실제 메모리에 할당된 것으로 실제 프로그램에서 사용되는 데이터.

---
즉 쉽게 말해서 클래스와 객체는 붕어빵을 만든다고 하면 클래스는 붕어빵을 만드는 틀이 될 수 있고 객체는 붕어빵 틀로 만들어진 붕어빵을 의미한다.
