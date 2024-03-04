# Two Sum

## Problem

Roman numerals can be represented by three symbols, `I`, `V`, `X`, `L`, `C`, `D`, `M`
| | |
| --- | --- |
| Symbol | Value |  
| I | 1 |  
| V | 5 |  
| X | 10 |  
| L | 50 |  
| C | 100 |  
| D | 500 |  
| M | 1000 |

Roman numerals are usually written from largest to smallest, left to right. However, four is not `IIII`, it is `IV`. Because the `I` is before the `V`.

There are six instances when subtraction is used.

- `I` can be placed before `V` and `X` to make 4 and 9
- `X` can be placed before `L` and `C` to make 40 and 90
- `C` can be placed before `D` and `M` to make 400 and 900

## Examples

### Example 1:

**Input:** `s=III`
**Output:** 3
**Explanation:** `III = 3`

### Example 2

**Input:** `s=LVIII`
**Output:** 58
**Explanation**: `L = 50, V= 5, III = 3`

### Example 3

**Input:** `s=MCMXCIV`
**Output:** 1994
**Explanation**: `M = 1000, CM = 900, XC = 90, IV = 4`

## Constraints

- `1 <= s.length <= 15`
- `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`
- It is **guaranteed** that `s` is a valid roman numeral in the range `[1, 3999]`
