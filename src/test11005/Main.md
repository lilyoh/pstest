```java
0 + 'A' = 'A';
1 + 'A' = 'B';
2 + 'A' = 'C';

5 + '0' = '5';
6 + '0' = '6';
```

- 정수형 숫자에 정수형 'A' 를 더하면 숫자만큼 알파벳이 증가
- 정수형 숫자에 정수형 '0' 를 더하면 '숫자' 꼴의 char형으로  변환됨

(아래 예시 참고)
```java
 if(rest >= 10 ) {
    ans += (char)(rest - 10 + (int)'A'); // 1번의 예시
} else {
    ans += (char)(rest + (int)'0'); // 2번의 예시
}
```