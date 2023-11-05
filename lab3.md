# Lab3

## Part1
<br>

**A failure-inducing input for the buggy program, as a JUnit test and any associated code:**
<br>

```ruby
@Test
public void testReverseInPlaceFailure()
{
  int[] input1 = {3, 1};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{1, 3}, input1);
}
```

**An input that doesn’t induce a failure, as a JUnit test and any associated code:**
<br>

```ruby
public void testReverseInPlace()
{
  int[] input1 = {3};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{3}, input1);
}
```

**The symptom, as the output of running the tests:**
<br>
From the image, we can see that the `reverseInPlace` function is not working as expected, which results in a failure during testing. It shows "3," but the correct answer should be "1." This indicates that the method is not functioning correctly, and we need to make edits to it.
<br>
<img width="994" alt="截屏2023-11-04 下午2 09 35" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/696df5e7-3acf-467e-8243-0a1d4c40519e">


**Before the change:**

```ruby
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
  }
}
```
**After the change:**

```ruby
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
```
<br>
Before the modification, the code tried to invert the array. But the original version doesn't do it very well because the logic is wrong. In essence the program provided was overwriting the elements with mirrored elements, so that caused the error brought on by the test. If you only iterate to half of the array and swap the elements at the ends, you can correctly invert the elements in the array. <br>


## Part2
**grep -n**  <br>
We used`grep -n "done" technical/911report/preface.txt` and `grep "done" technical/911report/preface.txt`  <br>
The `grep` command is used to search for patterns in text. <br>
The `-n` option is used to display line numbers along with the matching lines.  <br>
<br>
`grep -w "us" technical/911report/preface.txt` and `grep "us" technical/911report/preface.txt`, the `-w` option let the word search `grep` is matched as a complete exect word "us". <br>
<img width="656" alt="截屏2023-11-04 下午3 53 39" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/e10a58a9-f0f3-4d92-9543-8db8123a86c9">

`grep -n "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-w` option let the word search `grep` display line numbers along with the matching lines. <br>
<img width="901" alt="截屏2023-11-04 下午4 15 11" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/11609309-580f-4abb-998c-b86343358a04">

================================================================ <br>
**grep -w**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-w` option ensures that the pattern is matched as a complete and exact word and not as part of a word. <br>

`grep -w "us" technical/911report/preface.txt` <br>
`grep "us" technical/911report/preface.txt` <br>
`grep -w "us" technical/911report/preface.txt` and `grep "us" technical/911report/preface.txt`, the `-w` option let the word search `grep` is matched as a complete exect word "us". <br>
<img width="614" alt="截屏2023-11-04 下午3 56 06" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/461cda3a-d72d-432c-a2d5-0358fc71a949">

`grep -w "with" technical/911report/preface.txt` and `grep "with" technical/911report/preface.txt`, the `-w` option let the word search `grep` is matched as a complete exect word "with". <br>
<img width="931" alt="截屏2023-11-04 下午3 58 16" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/1f485762-6e95-45f8-b9e2-ead44f3cf4de">

================================================================ <br>
**grep -A -B**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-A (after) and -B (before)` options specify how many lines of context to display before and after the matched line.  <br>

`grep -A 2 -B 2 "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-A -B` option let the word search `grep` display lines of context 2 line before and 2 lines after the matched line. <br>
<img width="923" alt="截屏2023-11-04 下午4 04 35" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/5490d8c5-7175-4ff7-882e-52413af748d6">

`grep -A 1 -B 3 "This" technical/911report/preface.txt` and `grep "This" technical/911report/preface.txt`, the `-A -B` option let the word search `grep` display lines of context 1 line before and 3 lines after the matched line. <br>
<img width="902" alt="截屏2023-11-04 下午4 04 41" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/ce194c36-bef2-419e-a767-88e2f5333f70">
================================================================ <br>
**grep -i**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-i` option let search is case-insensitive.  <br>

`grep -i "This" technical/911report/preface.txt` and `grep "This" technical/911report/preface.txt`, the `-i` option let the word search `grep` match "This" regardless of whether it's written in uppercase `This` or lowercase letters `this`.
 <br>
<img width="915" alt="截屏2023-11-04 下午4 01 58" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/cf9fc851-a06d-4f78-91ca-d78d12c41858">

`grep -i "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-i` option let the word search `grep` match "This" regardless of whether it's written in uppercase `All` or lowercase letters `all`. <br>
<img width="905" alt="截屏2023-11-04 下午4 02 29" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/41888b58-5e0f-4681-95f6-87c989b91b33">
