cd C:\Users\tky\AppData\Local\Android\sdk\platfrom-tools
adb shell
su

cd data/data/com.tky.databasebasic/databases
sqlite3 sample.sqlite

.tables
SELECT * FROM books;
.quit
exit


