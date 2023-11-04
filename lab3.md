# Lab2

## Part1

A failure-inducing input for the buggy program, as a JUnit test and any associated code:
```ruby
@Test
public void testReverseInPlaceFailure()
{
  int[] input1 = {3, 1};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{1, 3}, input1);
}
```

An input that doesn’t induce a failure, as a JUnit test and any associated code:
```ruby
public void testReverseInPlace()
{
  int[] input1 = {3};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{3}, input1);
}
```

The symptom, as the output of running the tests:
<img width="994" alt="截屏2023-11-04 下午2 09 35" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/696df5e7-3acf-467e-8243-0a1d4c40519e">


Before:
```ruby
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
  }
}
```
After:
```ruby
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
```  
How to fix the bug?


## Part2
grep -n  <br>
grep -n "done" technical/911report/preface.txt <br>
grep "done" technical/911report/preface.txt <br>
<img width="656" alt="截屏2023-11-04 下午3 53 39" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/e10a58a9-f0f3-4d92-9543-8db8123a86c9">
grep -n "All" technical/911report/preface.txt <br>
grep "All" technical/911report/preface.txt <br>
<img width="901" alt="截屏2023-11-04 下午4 15 11" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/11609309-580f-4abb-998c-b86343358a04">


grep -w  <br>
grep -w "us" technical/911report/preface.txt <br>
grep "us" technical/911report/preface.txt <br>
<img width="614" alt="截屏2023-11-04 下午3 56 06" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/461cda3a-d72d-432c-a2d5-0358fc71a949">

grep -w "with" technical/911report/preface.txt <br>
grep "with" technical/911report/preface.txt <br>
<img width="931" alt="截屏2023-11-04 下午3 58 16" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/1f485762-6e95-45f8-b9e2-ead44f3cf4de">


grep -A -B  <br>
grep -A 2 -B 2 "All" technical/911report/preface.txt
grep "All" technical/911report/preface.txt
<img width="923" alt="截屏2023-11-04 下午4 04 35" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/5490d8c5-7175-4ff7-882e-52413af748d6">

grep -A 1 -B 3 "This" technical/911report/preface.txt
grep "This" technical/911report/preface.txt
<img width="902" alt="截屏2023-11-04 下午4 04 41" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/ce194c36-bef2-419e-a767-88e2f5333f70">

grep -i  <br>
grep -i "This" technical/911report/preface.txt
grep "This" technical/911report/preface.txt
<img width="915" alt="截屏2023-11-04 下午4 01 58" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/cf9fc851-a06d-4f78-91ca-d78d12c41858">

grep -i "All" technical/911report/preface.txt
grep "All" technical/911report/preface.txt
<img width="905" alt="截屏2023-11-04 下午4 02 29" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/41888b58-5e0f-4681-95f6-87c989b91b33">
