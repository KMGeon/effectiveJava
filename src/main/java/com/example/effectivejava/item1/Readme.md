# 아이템 1

---

- 목차
1. 생성자 대신 정적 팩터리 메서드를 고려하라.

## 1. 정적 팩토리를 사용해야 되는 이유

---

- 생성자에서 타입이 같은 경우에 문제가 발생한다.
- 이러한 부분을 처리하기 위해서 정적 팩토리 메서드를 작성하여 처리한다.

### [ 장점 ]
1. 이름을 가질 수 있다. (동일한 시그니처의 생성자를 두개 가질 수 없다.)
2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 도니다.
3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다. ( 인터페이스 기반 프레임워크, 인테페이스에 정적 메서드)
4. 입력 매개변수가 따라 매번 다른 클래스의 객체를 반환할 수 있다. (EnumSet)
5. 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.

### [ 단점 ] 
1. 상속을 하려면 public이나 protected 생성하기 필요하니 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없
   다
2. 다른 개발자가 쉽게 인식할 수 없다.

<br/>

```java
public Order(boolean prime, Product product) {
        this.prime = prime;
        this.product = product;
    }


    public Order(boolean urgent, Product product) {
        this.urgent = urgent;
        this.product = product;
    }

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
    
    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }
```


