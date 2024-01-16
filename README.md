# بخش اول، json-simple


## درصد test coverage را برای پروژه json-simple بدست آوردیم و در شکل زیر آن را نشان داده‌ایم.

<img width="1512" alt="کاورج jsonsimple" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/af7b8828-1e4d-45c4-b333-fdd910f16c68">

## حال report آن را نیز Generate می‌کنیم.


<img width="1512" alt="ریپورت json-simple" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/7cfb6522-2052-40f4-a6a2-b097eec3d08d">


# بخش دوم، CodeCoverage

  ## ابتدا درصد test coverage اولیه آن را نمایش می‌دهیم. در ادامه نیز تعدادی تست اضافه می‌کنیم که در هر قسمت آن را شرح داده ایم.

  <img width="1512" alt="کاورج codecoverage" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/76738a1a-d002-41e8-a423-30e05476490a">

 
### در کلاس PersonServiceTest

#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای PersonServiceImpl افزایش یافته است.

<img width="1512" alt="Screenshot 1402-10-25 at 14 21 49" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/df911b0d-546b-44fe-8864-795c88ba0d06">


#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای PersonServiceImpl افزایش یافته است.

<img width="1512" alt="Screenshot 1402-10-25 at 14 27 18" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/d1963ce9-68b5-4295-b882-6f72af2b5861">


### در کلاس FootpassengerTest

#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای Footpassenger افزایش یافته است.

<img width="1512" alt="Screenshot 1402-10-26 at 10 04 52" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/0588b972-f3b5-4677-8fec-b702a886ac6b">


### در کلاس PersonTest

#### تست های getter و setter زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای Person افزایش یافته است.


<img width="1512" alt="Screenshot 1402-10-26 at 10 17 15" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/c616adef-d7b5-47bc-a085-9548e7fca74a">

<img width="1512" alt="Screenshot 1402-10-26 at 10 17 24" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/4e4ba46d-1fba-4c34-9d21-9e4456b96f84">

### در کلاس TrafficTest

#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای Traffic افزایش یافته است.


<img width="1512" alt="Screenshot 1402-10-26 at 10 31 31" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/a4c684d2-bf5b-4ac5-8549-61f421106291">

### در کلاس PersonRepositoryTests

#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای PersonRepository افزایش یافته است.

<img width="1512" alt="Screenshot 1402-10-26 at 10 38 59" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/012ba12e-e922-4525-aa39-fe5a075c9abd">


### در کلاس PersonValidatorTest

#### تست زیر را اضافه میکنیم، همانطور که مشاهده میکنیم test coverage برای PersonValidator افزایش یافته است.

<img width="1512" alt="Screenshot 1402-10-26 at 10 51 49" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/5a40c260-63c8-4a36-9e40-237bcfdbf72a">


### نتیجه نهایی و افزایش code cverage را در عکس زیر مشاهده می‌کنیم.

<img width="1512" alt="Screenshot 1402-10-26 at 11 08 52" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/a4b92635-79ec-4c92-9530-e80829f50997">



### ریپورت را نیز generte می‌کنیم و هر قسمت را می‌توانیم تغییراتش را مشاهده کنیم؛ در اینجا person را بررسی کرده‌ایم.


<img width="1512" alt="Screenshot 1402-10-26 at 11 13 11" src="https://github.com/dariusamiri/SE_LAB_7/assets/59167222/ccda09db-0b46-4f8d-a719-a98933e80b5d">








# unittest.with.codecoverage
### _Demo of unit test with code coverage_

## Content
- Unit test exemples with jUnit5 and Mockito
- JaCoCo for code coverage report
- Dificult: Beginner

## Executions
- mvn clean install -DskipTests
- mvn jacoco:report
- mvn test

### JaCoCo report report can be found at _target/site/jacoco/index.html_

Slides with content of the topic (pt-BR):<br> https://docs.google.com/presentation/d/1Dkz-qUYigPFynfNk8KcAeyTIxhUmaVTZ4DM6d5UjcJE/edit?usp=sharing

