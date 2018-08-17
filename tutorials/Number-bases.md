# Number Bases

Number bases refer to what each digit of a number represent. Most of us never think about it because we are so accustomed to just one number base: base 10. Seeing as it is one we're all familiar with, let's start there.

## Base 10

In base 10, the **units** - the amount each digit is multiplied by - comes in powers of ten, so the number 5320.234 is really:

| Unit   | $1000$ | $100$ | $10$ | $1$  | $.$  | $\frac{1}{10}$ | $\frac{1}{100}$ | $\frac{1}{1000}$ |
| ------ | ------ | ----- | ---- | ---- | ---- | -------------- | --------------- | ---------------- |
| Number | 5      | 3     | 2    | 0    | .    | 2              | 3               | 4                |
|        | $*$    | $*$   | $*$  | $*$  |      | $*$            | $*$             | $*$              |
| +      | 5000   | 300   | 20   | 0    | .    | 0.2            | 0.03            | 0.04             |

So base 10 just means that each digit represents a power of 10, and the power of 10 which it represents is given by its value before or after the decimal point. Because of this, the maximum value of a single digit is 9 (10-1).

The first digit *before* the decimal point starts at $10^0 \,(=1)$  , the second $10^1 \,(=10)$, the third $10^2 \,(=100)$. In other words, a digit *n*-places *before* the decimal point represents $10^{n-1}$. 

The first digit *after* the decimal point starts at $10^{-1}\,(=0.1)$,  the second $10^{-2} \,(=0.01)$, the third $10^{-3} \,(=0.001)$. In other words, a digit *n*-places *after* the decimal point represents $10^{-n}$.

And for base n just substitute 10 for n. Let's solidify our understanding with the second most common base.

## Base 2

In base 2 a digit can be at maximum 1 $(2-1)$. That means that there are only two values: 0 and 1, and hence base 2 is commonly reffered to as *bi*nary. So, now just replace 10 before with 2, and we have base 2.

| Unit   | $8$  | $4$  | $2$  | $1$  | $.$  | $\frac{1}{2}$ | $\frac{1}{4}$ | $\frac{1}{8}$ |
| ------ | ---- | ---- | ---- | ---- | ---- | ------------- | ------------- | ------------- |
| Number | 1    | 1    | 1    | 0    | .    | 1             | 0             | 1             |
|        | $*$  | $*$  | $*$  | $*$  |      | $*$           | $*$           | $*$           |
| +      | 8    | 4    | 2    | 0    | .    | 0.5           | 0             | 0.125         |

So $1110.101$ in base 2 is $8+4+2+0.5+0.125=14.625$. A common way of notating the base of a number is using a subscript, so we could write $(1110.101)_2=(14.625)_{10}$. 

It is important to state the base of a number if you are dealing with more than one base because $1110.101$ could be in base 2, decimal, or any other base you have introduced. They are all completely different values. 

## Base n

Let's now formalise the general base system.

In base n the maximum value of a digit is $n-1$.

A digit *q*-places *before* the decimal point represents $n^{q-1}$. 

A digit *p*-places *after* the decimal point represents $n^{-p}$.

## Summary

We did not talk about conversion here, but I hope that from reading this your understanding of bases will make the process of conversion fairly simple. And I hope that you have seen just how simple bases are. We all think in base 10, but we rarely ask what that actually means. This tutorial aimed to remove the mist and clearly identify what a base is.