function plusOne(digits: number[]): number[] {
 let largeInt = BigInt(digits.map(String).join('')) + 1n
    return Array.from(String(largeInt), Number);
};;
