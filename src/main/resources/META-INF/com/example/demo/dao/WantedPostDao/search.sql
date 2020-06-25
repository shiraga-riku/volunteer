select
    P.`*`,U.name
from wanted_posts P
	INNER JOIN users U
	ON P.user_id=U.user_id
where
/*%if title != null*/
	title
    Like /* "%" + title "%" + */'a'
/*%end*/
/*%if wantedPeople != null*/
	AND
    /*wantedPeople*/10 < wanted_people
/*%end*/