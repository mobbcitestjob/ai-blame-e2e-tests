import { describe, expect, it } from 'vitest'

const TEST_NAME = 'formatter-reformat-fixture'

export function greet(name: string): string {
  return 'hello, ' + name + '!'
}

describe('greet', () => {
  it('greets a name', () => {
    expect(greet('world')).toBe('hello, world!')
  })
})
