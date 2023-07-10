#!/bin/bash


# Add Department NAme: ASET

curl --silent --location 'http://localhost:9090/departments' \
    --header 'Content-Type: application/json' \
    --data '{
   "department_name":"ASET"
}' | jq .

echo ""

# Add department Name: AIIT
curl --silent --location 'http://localhost:9090/departments' \
    --header 'Content-Type: application/json' \
    --data '{
   "department_name":"AIIT"
}' | jq .

echo ""

# Create Programme B.Tech & Add to department ASET

curl --silent --location 'http://localhost:9090/programmes' \
    --header 'Content-Type: application/json' \
    --data '{
   "course_name":"B.Tech",
      "department" : "departments/1"
}' | jq .

echo ""

# Create Subject Maths
curl --silent --location 'http://localhost:9090/subjects' \
    --header 'Content-Type: application/json' \
    --data '{
    "subject_id": 1,
        "subject_name": "Maths"
        
}' | jq .

echo ""

# Create semester 1 for B.Tech

curl --silent --location 'http://localhost:9090/semesters' \
    --header 'Content-Type: application/json' \
    --data '{
    "semester_number": 1,
        "programmes": "programmes/1"
}'| jq .

echo "Create Faculty Arpit & assign maths & dept ASET"

curl --silent --location 'http://localhost:9090/faculties' \
    --header 'Content-Type: application/json' \
    --data '{
    "faculty_id": 1,
        "faculty_name": "Arpit",
            "faculty_gender": "Male",
            "subjects": [
                    "subjects/1"
            ],
                "department": "departments/1"
}' | jq .

echo ""

curl --silent --location 'http://localhost:9090/sections' \
    --header 'Content-Type: application/json' \
    --data '{
    "semester_id": "semesters/1",
        "section_number": 1
}' | jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/sections/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "faculties": [
            "faculties/1"
    ]
}' | jq .

echo ""

curl --silent --location 'http://localhost:9090/students' \
    --header 'Content-Type: application/json' \
    --data '{
    "enrollment_number": 1191,
        "student_name": "Harshit",
            "student_gender": "Male",
                "student_dob": 2004,
                    "batch_year": 2021,
                        "course_id": "programmes/1"
}' | jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/faculties/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "sections": [
            "sections/1"
    ]
}'| jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/semesters/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "subjects": [
            "subjects/1"
    ]
}' | jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/programmes/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "semesters": [
            "semesters/1"
    ]
}' | jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/subjects/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "semesterList": [
            "semesters/1"
    ]
}'| jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/subjects/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "faculties": [
            "faculties/1"
    ]
}' | jq .

echo ""

#Assigning faculty to a section

curl --silent --location 'http://localhost:9090/teachingAssignments' \
    --header 'Content-Type: application/json' \
    --data '{
    "section": "sections/1",
        "faculty": "faculties/1",
            "subject": "subjects/1"
}' | jq .


echo ""

curl --silent --location --request PATCH 'http://localhost:9090/students/1191' \
    --header 'Content-Type: application/json' \
    --data '{
    "sections": "sections/1"
}' | jq .

echo ""

curl --silent --location --request PATCH 'http://localhost:9090/sections/1' \
    --header 'Content-Type: application/json' \
    --data '{
    "students": [
            "students/1"
    ]
}'| jq .

#curl -s --location --request PATCH 'http://localhost:9090/subjects/1' \
#    --header 'Content-Type: application/json' \
#    --data '{
#    "semesterList": [
#            "semesters/1"
#    ]
#}' > /dev/null
