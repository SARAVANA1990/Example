package bigdecimalexample;

import java.math.*;
public class doubleToBigDec
{
   private final static String NEW_LINE = System.getProperty("line.separator");

   public static void main(final String[] arguments)
   {
      //
      // Demonstrate BigDecimal from double
      //
      final double primitiveDouble = 0.1;
      final BigDecimal bdPrimDoubleCtor = new BigDecimal(primitiveDouble);
      final BigDecimal bdPrimDoubleValOf = BigDecimal.valueOf(primitiveDouble);
      final Double referenceDouble = Double.valueOf(0.1);
      final BigDecimal bdRefDoubleCtor = new BigDecimal(referenceDouble);
      final BigDecimal bdRefDoubleValOf = BigDecimal.valueOf(referenceDouble);

      System.out.println("Primitive Double: " + primitiveDouble);
      System.out.println("Reference Double: " + referenceDouble);
      System.out.println("Primitive BigDecimal/Double via Double Ctor: " + bdPrimDoubleCtor);
      System.out.println("Reference BigDecimal/Double via Double Ctor: " + bdRefDoubleCtor);
      System.out.println("Primitive BigDecimal/Double via ValueOf: " + bdPrimDoubleValOf);
      System.out.println("Reference BigDecimal/Double via ValueOf: " + bdRefDoubleValOf);

      System.out.println(NEW_LINE);

      //
      // Demonstrate BigDecimal from float
      //
      final float primitiveFloat = 0.1f;
      final BigDecimal bdPrimFloatCtor = new BigDecimal(primitiveFloat);
      final BigDecimal bdPrimFloatValOf = BigDecimal.valueOf(primitiveFloat);
      final Float referenceFloat = Float.valueOf(0.1f);
      final BigDecimal bdRefFloatCtor = new BigDecimal(referenceFloat);
      final BigDecimal bdRefFloatValOf = BigDecimal.valueOf(referenceFloat);

      System.out.println("Primitive Float: " + primitiveFloat);
      System.out.println("Reference Float: " + referenceFloat);
      System.out.println("Primitive BigDecimal/Float via Double Ctor: " + bdPrimFloatCtor);
      System.out.println("Reference BigDecimal/Float via Double Ctor: " + bdRefFloatCtor);
      System.out.println("Primitive BigDecimal/Float via ValueOf: " + bdPrimFloatValOf);
      System.out.println("Reference BigDecimal/Float via ValueOf: " + bdRefFloatValOf);

      System.out.println(NEW_LINE);

      //
      // More evidence of issues casting from float to double.
      //
      final double primitiveDoubleFromFloat = 0.1f;
      final Double referenceDoubleFromFloat = new Double(0.1f);
      final double primitiveDoubleFromFloatDoubleValue = new Float(0.1f).doubleValue();

      System.out.println("Primitive Double from Float: " + primitiveDoubleFromFloat);
      System.out.println("Reference Double from Float: " + referenceDoubleFromFloat);
      System.out.println("Primitive Double from FloatDoubleValue: " + primitiveDoubleFromFloatDoubleValue);

      //
      // Using String to maintain precision from float to BigDecimal
      //
      final String floatString = String.valueOf(new Float(0.1f));
      final BigDecimal bdFromFloatViaString = new BigDecimal(floatString);
      System.out.println("BigDecimal from Float via String.valueOf(): " + bdFromFloatViaString);
   }
}
