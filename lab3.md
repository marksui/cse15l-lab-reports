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
`grep -n "us" technical/911report/preface.txt`
```
$ grep -n "us" technical/911report/preface.txt
10:            We have come together with a unity of purpose because our nation demands it.
17:            Our mandate was sweeping. The law directed us to investigate "facts and circumstances
25:                current and previous administrations who had responsibility for topics covered in
34:                enemy rallies broad support in the Arab and Muslim world by demanding redress of
35:                political grievances, but its hostility toward us and our values is limitless. Its
36:                purpose is to rid the world of religious and political pluralism, the plebiscite,
41:                adjust their policies, plans, and practices to deter or defeat it. We learned of
49:                together as a nation. The test before us is to sustain that unity of purpose and
50:                meet the challenges now confronting us. We need to design a balanced strategy for
54:                agencies that prevailed in the great struggles of the twentieth century must work
56:                Congress needs dramatic change as well to strengthen oversight and focus
69:                have searched records and produced a multitude of documents for us. We thank
70:                officials, past and present, who were generous with their time and provided us with
72:                Inspectors General at the Department of Justice and the CIA provided great
75:                of several previous Commissions, and we thank the Congressional Joint Inquiry, whose
76:                fine work helped us get started. We thank the City of New York for assistance with
81:                us each step of the way, as partners and witnesses. They know better than any of us
87:                issues and organizations, we are conscious of our limits. We have not interviewed
96:                enormous sympathy for the victims and their loved ones, and with enhanced respect
99:                number of them. We decided consciously to focus on recommendations we believe to be
101:                this process with strong opinions about what would work. All of us have had to
102:                pause, reflect, and sometimes change our minds as we studied these problems and
```
`grep -n "All" technical/911report/preface.txt` 
```
$ grep -n "All" technical/911report/preface.txt
101:                this process with strong opinions about what would work. All of us have had to
```
`grep -n "us" technical/911report/preface.txt` and `grep "us" technical/911report/preface.txt`, the `-n` option let the word search `grep` display line numbers along with the matching lines. <br>
<img width="656" alt="截屏2023-11-04 下午3 53 39" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/e10a58a9-f0f3-4d92-9543-8db8123a86c9">

`grep -n "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-n` option let the word search `grep` display line numbers along with the matching lines. <br>
<img width="901" alt="截屏2023-11-04 下午4 15 11" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/11609309-580f-4abb-998c-b86343358a04">

================================================================ <br>
**grep -w**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-w` option ensures that the pattern is matched as a complete and exact word and not as part of a word. <br>

`grep -w "us" technical/911report/preface.txt` <br>
```
$ grep -w "us" technical/911report/preface.txt
            Our mandate was sweeping. The law directed us to investigate "facts and circumstances
                political grievances, but its hostility toward us and our values is limitless. Its
                together as a nation. The test before us is to sustain that unity of purpose and
                meet the challenges now confronting us. We need to design a balanced strategy for
                have searched records and produced a multitude of documents for us. We thank
                officials, past and present, who were generous with their time and provided us with
                fine work helped us get started. We thank the City of New York for assistance with
                us each step of the way, as partners and witnesses. They know better than any of us
                this process with strong opinions about what would work. All of us have had to
```
`grep "us" technical/911report/preface.txt` <br>
```
$ grep "us" technical/911report/preface.txt
            We have come together with a unity of purpose because our nation demands it.
            Our mandate was sweeping. The law directed us to investigate "facts and circumstances
                current and previous administrations who had responsibility for topics covered in
                enemy rallies broad support in the Arab and Muslim world by demanding redress of
                political grievances, but its hostility toward us and our values is limitless. Its
                purpose is to rid the world of religious and political pluralism, the plebiscite,
                adjust their policies, plans, and practices to deter or defeat it. We learned of
                together as a nation. The test before us is to sustain that unity of purpose and
                meet the challenges now confronting us. We need to design a balanced strategy for
                agencies that prevailed in the great struggles of the twentieth century must work
                Congress needs dramatic change as well to strengthen oversight and focus
                have searched records and produced a multitude of documents for us. We thank
                officials, past and present, who were generous with their time and provided us with
                Inspectors General at the Department of Justice and the CIA provided great
                of several previous Commissions, and we thank the Congressional Joint Inquiry, whose
                fine work helped us get started. We thank the City of New York for assistance with
                us each step of the way, as partners and witnesses. They know better than any of us
                issues and organizations, we are conscious of our limits. We have not interviewed
                enormous sympathy for the victims and their loved ones, and with enhanced respect
                number of them. We decided consciously to focus on recommendations we believe to be
                this process with strong opinions about what would work. All of us have had to
                pause, reflect, and sometimes change our minds as we studied these problems and
```
`grep -w "us" technical/911report/preface.txt` and `grep "us" technical/911report/preface.txt`, the `-w` option let the word search `grep` is matched as a complete exect word "us". <br>
<img width="614" alt="截屏2023-11-04 下午3 56 06" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/461cda3a-d72d-432c-a2d5-0358fc71a949">

`grep -w "with" technical/911report/preface.txt` and `grep "with" technical/911report/preface.txt`, the `-w` option let the word search `grep` is matched as a complete exect word "with". <br>
<img width="931" alt="截屏2023-11-04 下午3 58 16" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/1f485762-6e95-45f8-b9e2-ead44f3cf4de">

================================================================ <br>
**grep -A -B**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-A (after) and -B (before)` options specify how many lines of context to display before and after the matched line.  <br>

`grep -A 2 -B 2 "All" technical/911report/preface.txt`
```
$ grep -A 2 -B 2 "All" technical/911report/preface.txt
                number of them. We decided consciously to focus on recommendations we believe to be
                most important, whose implementation can make the greatest difference. We came into
                this process with strong opinions about what would work. All of us have had to
                pause, reflect, and sometimes change our minds as we studied these problems and
                considered the views of others. We hope our report will encourage our fellow
```
`grep -A 1 -B 3 "This" technical/911report/preface.txt`
```
$ grep -A 1 -B 3 "This" technical/911report/preface.txt
                aviation, the role of congressional oversight and resource allocation, and other
                areas determined relevant by the Commission. In pursuing our mandate, we have
                reviewed more than 2.5 million pages of documents and interviewed more than 1,200
                individuals in ten countries. This included nearly every senior official from the
                current and previous administrations who had responsibility for topics covered in
--
                the importance of the work we have undertaken.
            We want to note what we have done, and not done. We have endeavored to provide the
                most complete account we can of the events of September 11, what happened and why.
                This final report is only a summary of what we have done, citing only a fraction of
                the sources we have consulted. But in an event of this scale, touching so many
```
`grep -A 2 -B 2 "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-A -B` option let the word search `grep` display lines of context 2 line before and 2 lines after the matched line. <br>
<img width="923" alt="截屏2023-11-04 下午4 04 35" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/5490d8c5-7175-4ff7-882e-52413af748d6">

`grep -A 1 -B 3 "This" technical/911report/preface.txt` and `grep "This" technical/911report/preface.txt`, the `-A -B` option let the word search `grep` display lines of context 1 line before and 3 lines after the matched line. <br>
<img width="902" alt="截屏2023-11-04 下午4 04 41" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/ce194c36-bef2-419e-a767-88e2f5333f70">
================================================================ <br>
**grep -i**  <br>
The `grep` command is used to search for patterns in text. <br>
The `-i` option let search is case-insensitive.  <br>
`grep -i "This" technical/911report/preface.txt`
```
$ grep -i "This" technical/911report/preface.txt
            We present the narrative of this report and the recommendations that flow from it to
                partisan division-have come together to present this report without dissent.
                the United States. The nation was unprepared. How did this happen, and how can we
                individuals in ten countries. This included nearly every senior official from the
                and national security did not understand how grave this threat could be, and did not
                We hope that the terrible losses chronicled in this report can create something
                Commissioners, whose dedication to this task has been profound. We have reasoned
                together over every page, and the report has benefited from this remarkable
                Philip Zelikow, has contributed innumerable hours to the completion of this report,
                setting aside other important endeavors to take on this all-consuming assignment.
                & Company for helping to get this report to the broad public.
            We conclude this list of thanks by coming full circle: We thank the families of 9/11,
                This final report is only a summary of what we have done, citing only a fraction of
                the sources we have consulted. But in an event of this scale, touching so many
                inevitably will come to light. We present this report as a foundation for a better
                preparing to respond if it becomes necessary. We emerge from this investigation with
                this process with strong opinions about what would work. All of us have had to
```
`grep -i "All" technical/911report/preface.txt`
```
$ grep -i "All" technical/911report/preface.txt
                aviation, the role of congressional oversight and resource allocation, and other
                enemy rallies broad support in the Arab and Muslim world by demanding redress of
                meet the challenges now confronting us. We need to design a balanced strategy for
                together in new ways, so that all the instruments of national power can be combined.
                setting aside other important endeavors to take on this all-consuming assignment.
                for the American people. We recognize the formidable challenges that lie ahead.
                this process with strong opinions about what would work. All of us have had to
```
`grep -i "This" technical/911report/preface.txt` and `grep "This" technical/911report/preface.txt`, the `-i` option let the word search `grep` match "This" regardless of whether it's written in uppercase `This` or lowercase letters `this`.
 <br>
<img width="915" alt="截屏2023-11-04 下午4 01 58" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/cf9fc851-a06d-4f78-91ca-d78d12c41858">

`grep -i "All" technical/911report/preface.txt` and `grep "All" technical/911report/preface.txt`, the `-i` option let the word search `grep` match "This" regardless of whether it's written in uppercase `All` or lowercase letters `all`. <br>
<img width="905" alt="截屏2023-11-04 下午4 02 29" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/41888b58-5e0f-4681-95f6-87c989b91b33">
