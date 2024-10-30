# 자바 실습 환경 구축하기

## 자바가상머신 설치 순서
- oracle JDK21 다운
- 실행 파일에서 오른쪽 마우스 버튼 클릭 후 관리자 권한으로 설치하기
- 물리적 위치
c:\>jdk-21
   - java명령과 javac명령의 위치는 bin 폴더 아래 위치
- IntelliJ를 사용하지 않는다면 
javac D:\>workspace_java\basic1\src\day1\variable\Hello.java

java D:\>workspace_java\basic1\out\production\day1\variable\Hello.class

도스명령 프롬프트에서 일일이 이렇게 컴파일하고 실행하는 것은 불편하므로 IntelliJ를 사용

<br />
<img src=:"" />

클래스는 메모리 영역 중 heap area에 로딩됨.
heap area에는 클래스가 로딩됨.
클래스가 소유하고 있는 변수나 메소드를 호출할 수 있음.
클래스 = 변수 + 메소드
