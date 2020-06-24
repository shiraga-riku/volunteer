select
    /*%expand*/*
from subscriptions
where user_id = /*userId*/1
AND wanted_post_id = /*wantedPostId*/1