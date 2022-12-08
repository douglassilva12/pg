//CDmg: the Damage per use of the charge move
//CDPS: the DPS of a charge move, which equals to CDmg/CDur
//CDur: the Duration of the charge move in seconds
//CDWS: the Damage Window Start of the charge move in seconds
//CE: the Energy used per use of the charge move, positive
//CEPS: the EPS of a charge move, which equals to CE/CDur
//Def: the current Defense stat of the subject Pokemon
//DPS: the Comprehensive DPS
//DPS0: the Simple Cycle DPS
//FDmg: the Damage per use of the fast move
//FDPS: the DPS of a fast move, which equals to FDmg/FDur
//FDur: the Duration of the fast move in seconds
//FE: the Energy gained per use of the fast move, positive
//FEPS: the EPS of a fast move, which equals to FE/FDur
//HP: the effective HP of the subject Pokemon
//x : the energy left of the Pokemon when the battle ends
//y: the DPS of the enemy
//
//DPS=dps0+((cdps-fdps)/(ceps+feps))*(0,5-(x/HP))*y
//DPS0=(fdps*ceps+cdps*feps)/(ceps+feps)
//
//one-bar charge moves
//CEPS=(CE+(0,5*FE)+(0,5*y)*CDWS)/CDur