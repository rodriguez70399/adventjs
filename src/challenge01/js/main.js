let findFirstRepeated = gifts => 
{
    const seenGifts = new Set();

    for (const gift of gifts) 
    {
        if (seenGifts.has(gift)) 
        {
            return gift;
        }
        else 
        {
            seenGifts.add(gift);
        }
    }

    return -1;
}

const giftIds = [2, 1, 3, 5, 3, 2]
const firstRepeatedId = findFirstRepeated(giftIds)
console.log(firstRepeatedId) // 3