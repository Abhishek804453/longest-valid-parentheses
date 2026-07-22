# Longest Valid Parentheses

## Problem

Given a string containing only '(' and ')', find the length of the longest valid parentheses substring.

## Language

Java

## Approach

- Store indices of opening brackets using a stack.
- Keep track of the last unmatched bracket.
- Update the maximum valid substring length whenever a valid pair is found.

## Time Complexity

O(n)

## Space Complexity

O(n)
