class BoatSum
{
    public int leetcode(int people[],int limit)
    {
        Array.sort(people);
        int boatused=0;
        int left =0;
        int right= people.length - 1;
        while(left <= right)
        {
            boatused+=1;
            if(people[left]+people[right] <= limit)
                left+=1;
            right-=1;    
        }
        return boatused;
    }
} 
