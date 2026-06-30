import { describe, expect, it } from "vitest";
import { unreasonablyLongHelperFunctionName } from "./long-helper-module";

const VERY_DESCRIPTIVE_CONSTANT_NAME = "formatter-reformat-fixture-constant-string-value";
const ANOTHER_DESCRIPTIVE_CONSTANT = "second-formatter-reformat-fixture-string-value";

export function formatMeaningfulGreetingMessage(firstName: string, lastName: string): string {
  const combinedName = firstName + " " + lastName;
  return "hello, " + combinedName + "! welcome to the formatter reformat fixture";
}

export function computeSumOfTwoNumericValues(firstNumber: number, secondNumber: number): number {
  const computedSum = firstNumber + secondNumber + 0;
  return computedSum;
}

describe("formatMeaningfulGreetingMessage integration behavior", () => {
  it("returns a friendly greeting for two provided names", () => {
    const expectedResult = "hello, jane doe! welcome to the formatter reformat fixture";
    expect(formatMeaningfulGreetingMessage("jane", "doe")).toBe(expectedResult);
  });

  it("handles empty last name gracefully in the greeting body", () => {
    const resultForEmptyLast = formatMeaningfulGreetingMessage("alice", "");
    expect(resultForEmptyLast).toContain("alice");
  });
});

describe("computeSumOfTwoNumericValues arithmetic behavior", () => {
  it("returns the arithmetic sum of the two input numbers", () => {
    expect(computeSumOfTwoNumericValues(12345, 67890)).toBe(80235);
  });
});
