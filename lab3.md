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
grep -n
grep -n "pattern" file.txt

grep -w

grep -A -B
grep -A 2 -B 2 "pattern" file.txt

grep -i
