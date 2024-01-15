
# LeetCode Challenge D32
## Achievements
[![image.png](https://i.postimg.cc/FFf0qPMf/image.png)](https://postimg.cc/DmTW4cyF)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2068. Check Whether Two Strings are Almost Equivalent](https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Two strings  `word1`  and  `word2`  are considered  *almost equivalent*  if the differences between the frequencies of each letter from  `'a'`  to  `'z'`  between  `word1`  and  `word2`  is  *at most*  `3`.

Given two strings  `word1`  and  `word2`, each of length  `n`, return  `true`  _if_ `word1`  _and_  `word2`  _are  *almost equivalent*, or_  `false`  _otherwise_.

The  *frequency*  of a letter  `x`  is the number of times it occurs in the string.

**Example**

> **Input:** word1 = "aaaa", word2 = "bccb"
> 
>**Output:** false
> 
>**Explanation:**
>There are 4 'a's in "aaaa" but 0 'a's in "bccb".
>The difference is 4, which is more than the allowed 3.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The solution aims to determine the almost equivalence of two strings, `word1` and `word2`, based on the differences in letter frequencies from 'a' to 'z'. It initializes an array `frequencyDiff` of size 26 to represent the differences in frequencies for each letter. 

The algorithm iterates through the characters of both strings simultaneously, incrementing the corresponding index in `frequencyDiff` for each character in `word1` and decrementing for each character in `word2`. 

Subsequently, it checks the absolute differences in frequencies stored in `frequencyDiff`. If any difference exceeds the allowed limit of 3, the function returns `false`, signifying that the strings are not almost equivalent. Conversely, if all differences fall within the specified range, the function returns `true`, indicating that the strings are almost equivalent.
