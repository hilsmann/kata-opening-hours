You can find the source for this Kata here:

https://github.com/christian-fei/opening-hours-kata

# opening-hours-kata

Amy and Valerie, the shop owners, need you to develop a simple program that satisfies the following requirements:


- The opening days and hours of the shop need to be configurable, and can be scattered in the week (e.g. Mon, Wed, Fri from 08:00 to 16:00)
- Amy needs to display the date of the next opening on a billboard outside of the shop
- Amy also wants to display on the website of the shop whether it is opened or closed at the moment

Write a small module that follows this contract, so that Valerie can easily integrate it:

```
OpeningHours.isOpenOn(date)
OpeningHours.nextOpeningDate(date)
```


## test cases

You can use the following test cases to get started:

```
Shop opening days: Mon, Wed, Fri
Shop opening hours: 08:00 - 16:00

wednesday = '2016-05-11T12:22:11.824Z'
thursday = '2016-05-12T12:22:11.824Z'
fridayMorning = '2016-05-13T08:00:00.000Z'

OpeningHours.isOpenOn(wednesday) == true
OpeningHours.isOpenOn(thursday) == false

OpeningHours.nextOpeningDate(wednesday) === fridayMorning
```

## Tasks:
1. Implement the Methods isOpenOn() and nextOpeningDate() in the OpeningHours class. Use the classes that are already created. But you can create as many as you want.
2. Implement at least the test cases above. You can use TDD or implement them after you implement the functionality.
3. (Optional) Create a console Output for all opening days. To do this, create a new Method in the OpeningHours class that is called `printOpeningHours()`.



Choose whatever language you like. (PS: Valerie likes Haskell and Elixir).