public class Solution {
    public string IntToRoman(int num) {
        return num switch{
            >= 1000 => "M" + IntToRoman(num - 1000) ,
            >=900 => "CM" + IntToRoman(num - 900),
            >=500 => "D" + IntToRoman(num - 500),
            >=400  => "CD" + IntToRoman(num - 400),
            >=100  => "C" + IntToRoman(num - 100),
            >=90 => "XC" + IntToRoman(num - 90),
            >=50  => "L" + IntToRoman(num - 50),
            >=40  => "XL" + IntToRoman(num - 40),
            >=10  => "X" + IntToRoman(num - 10),
            9 => "IX" + IntToRoman(num - 9),
            >=5 => "V" + IntToRoman(num - 5),
            4 => "IV" + IntToRoman(num - 4),
            >=1 => "I" + IntToRoman(num - 1),
            _ => ""
        };
    }
}